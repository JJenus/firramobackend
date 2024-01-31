package com.firramo.firramoapi.repository.firramo;

import com.firramo.firramoapi.model.firramo.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);

    @Query(value = "SELECT * FROM app_user" +
            " WHERE status != 'deleted'" +
            " order by created_at desc " +
            " LIMIT ?1, ?2 ;", nativeQuery = true)
    List<AppUser> getUsersByPage(int start, int end);
    Optional<AppUser> findByEmailAndStatusNot(String email, String status);

    @Query(value = "SELECT * FROM app_user WHERE status != 'deleted' " +
            " order by created_at desc ", nativeQuery = true)
    List<AppUser> getNotDeletedUsers();

    @Query(value = "SELECT * FROM app_user e WHERE e.email LIKE %:q% OR e.name LIKE %:q%", nativeQuery = true)
    List<AppUser> findLikeEmailOrName(@Param("q") String q);
    List<AppUser> findByEmailContainingOrNameContaining(String email, String name);
}
