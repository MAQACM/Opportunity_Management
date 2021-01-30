package com.Opportunity_Management.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value="SELECT * FROM users u WHERE  binary u.email = :email or binary u.user_name= :uName",nativeQuery=true)
	public List<User> findByEmailAndUName(@Param("email") String email,@Param("uName") String uName);
    @Query(value="SELECT * FROM users u WHERE  binary u.user_name= :uName",nativeQuery=true)
	public List<User> findByUsername(@Param("uName") String uName );
}
