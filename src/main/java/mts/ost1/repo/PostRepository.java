package mts.ost1.repo;

import mts.ost1.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {

}
