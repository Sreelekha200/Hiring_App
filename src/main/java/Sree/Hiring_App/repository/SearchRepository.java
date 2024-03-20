package Sree.Hiring_App.repository;

import java.util.List;

import Sree.Hiring_App.model.Post;

public interface SearchRepository {
     List<Post> findByText(String text);
}
