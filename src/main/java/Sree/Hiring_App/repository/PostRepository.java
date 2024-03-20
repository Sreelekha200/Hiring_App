package Sree.Hiring_App.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Sree.Hiring_App.model.Post;

public interface PostRepository extends MongoRepository<Post,String> {

}
