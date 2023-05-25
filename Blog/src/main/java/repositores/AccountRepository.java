package repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	//查找用户名
	Account findByUsername(String username);

}
