package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Account;
import repositores.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository repository;

	// 判断数据是否已经在数据库
	public boolean validateAccount(String username, String passoword) {
		Account account = repository.findByUsername(username);
		if (account == null || !account.getPassword().equals(passoword)) {
			return false;
		} else {
			return true;
		}
	}

	// 如果用户在数据库内就创建失败，反之则成功
	public boolean createAccount(String username, String password, String gender) {
		if (repository.findByUsername(username) == null) {
			repository.save(new Account(username, password, gender));
			return true;
		} else {
			return false;
		}
	}

	// 创建新用户
	public boolean createNewUser(Account account) {
		if (AccountRepository.findByUsername(account.getUsername()) != null) {
			AccountRepository.save(account);
			return true;
		} else
			return false;
	}
}
