package StudentCurdApprepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import StudentCurdAppentities.StudentApp;

public interface StudentAppRepository extends JpaRepository<StudentApp,Integer> {

}
