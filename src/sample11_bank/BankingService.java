package sample11_bank;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingService {									// 기능이 구체적
	
	private BankingRepository repo = new BankingRepository();
	
	// 신규 계좌 개설하기 기능 
	/*  사용자가 입력한 신규 계좌 정보를 전달받아서 영속화계층을 저장시키고., 개설된 계좌정보를 반환한다.
	 * 	반환타입 : Account
	 * 	메소드명 : createAccount
	 *  매개변수 : Account account
	 */
	public Account createAccount(Account account) {
		
		// 전달받은 계좌정보에 계좌상태, 개설일시 저장한다.
		account.setStatus("사용중");
		account.setCreateDate(new Date());
		
		// 영속화 계층에 계좌정보를 전달해서 저장시킨다.
		repo.insertAccount(account);
		
		return account;
	}
	
	// 전 계좌 조회하기
	/*
	 * 예금주명을 전달받아서 해당 예금주명을 개설된 모든 계좌정보를 조회해서 반환한다.
	 * 	반환타입 : List<Account>
	 * 	메소드명 : getMyAllAccounts
	 *  매개변수 : String name
	 */
	public List<Account> getMyAllAccounts(String name) {
		List<Account> accounts = repo.getAccountsByName(name);
		return accounts;
	}
	
	// 계좌 상세정보 조회하기
	/*
	 * 계좌번호와 비밀번호를 전달받아서 계좌상세정보를 반환한다.	
	 *  반환타입 : Account
	 * 	메소드명 : getAccountDetail
	 *  매개변수 : int accNo, int pwd
	 */
	public Account getAccountDetail(int accNo, int pwd) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			
		}
		if (account.getPassword() != pwd) {
			return null;
		}
		
		return account;
	}
	
	// 입금하기
	/*
	 * 계좌번호와 입금액을 전달받아서 현재 잔액을 증가시킨다.
	 *  반환타입 : boolean
	 *  메소드명 : deposit
	 *  매개변수 : int accNo, long amount
	 */
	public boolean deposit(int accNo, long amount) {
		Account account = repo.getAccountByNo(accNo);			//accNo해당되는 계좌정보 없을경우
		if (account == null) {
			return false;
		}
		
		long balance = account.getBalance() + amount; 			// 현재잔액 account.getBalance + 입금액(amount)
		account.setBalance(balance);
		
		return true;
	
	}
	
	// 출금하기
	//내가한거
//	public boolean withdraw(int accNo, int pwd, long amount) {
//		Account account = repo.getAccountByNo(accNo);
//		if (account == null) {
//			return false;
//		} 
//		if (password != account.getPassword()) {
//			return false;			
//		}
//		if (amount > account.getBalance()) {
//			return false;						
//		}
//		
//		long balance = account.getBalance() - amount;
//		account.setBalance(balance);
//		
//		return true;
//		
//	}																-> 다른조건문들이므로 else if가 아닌 다른조건문으로 확인
	
//	public boolean withdraw(int accNo, int password, long amount) {
//		Account account = repo.getAccountByNo(accNo);		
//		if (account == null) {
//			return false;
//		}
//		if (password != account.getPassword()) {
//			return false;
//		} 
//		if (amount > account.getBalance()) {
//			return false;
//		}
//		
//		long balnace = account.getBalance() - amount;
//		account.setBalance(balnace);
//		
//		return true;
//	}

	public boolean withdraw(int no, int pwd, long amount) {
		Account account = repo.getAccountByNo(no);		
		if (account == null) {
			return false;
		}
		if (pwd != account.getPassword()) {
			return false;
		} 
		if (amount > account.getBalance()) {
			return false;
		}
		
		long balnace = account.getBalance() - amount;
		account.setBalance(balnace);
		
		return false;
	}


		
//		if (account == null
//				|| password != account.getPassword()
//				|| amount > account.getBalance());
	
	
	// 비밀번호 변경하기
	// 내가 한거
//	public boolean changePassword(int no, int prepwd, int pwd) {
//		Account account = repo.getAccountByNo(no);
//		if (account == null) {
//			return false;
//		} 
//		if (account.getPassword() != prepwd) {
//			return false;
//		}
//		account.setPassword(pwd);
//		return true;
//	}
	
	public boolean  changePassword(int accNo, int prePassword, int password) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			return false;
		}
		if (account.getPassword() != prePassword) {
			return false;
		}
		account.setPassword(password);
		return true;
	}
	
	
	// 해지하기
	public Map<String, Object> expireAccount(int accNo, int password) {
		Map<String, Object> result = new HashMap<>();
		// null 반환 / 값을 반환한다. (비어있을수 있다.)
		
		Account account = repo.getAccountByNo(accNo);			// account안에는 해지예상금액이나 없는 객체가있다. 
		if (account == null) {
			result.put("success", false);
			return result;
		}
		if (account.getPassword() != password) {
			result.put("success", false);
			return result;
		}
		
		int interest = (int) (account.getBalance()*account.getInerestRate()*5);
		result.put("success", true);
		result.put("no", account.getNo());
		result.put("owner", account.getOwner());
		result.put("balance", account.getBalance());
		result.put("interest", interest);			// 이자
		result.put("amount", account.getBalance() + interest);
		
		repo.deleteAccount(accNo);
		
		return result;
	}
}
