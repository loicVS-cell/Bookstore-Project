package be.ehb.bookstore.repository;

import be.ehb.bookstore.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

    List<Review> findByBookId(int bookId);

    List<Review> findByUserId(int userId);

    boolean existsByUserIdAndBookId(int userId, int bookId);
}