package com.group.libraryapp.domain.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

    Boolean existsByBookNameAndIsReturn(String name, Boolean isReturn);

    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);


}
