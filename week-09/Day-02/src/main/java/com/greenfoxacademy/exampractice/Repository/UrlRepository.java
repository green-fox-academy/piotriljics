package com.greenfoxacademy.exampractice.Repository;

import com.greenfoxacademy.exampractice.Model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, String> {
    Url findByInputAlias(String alias);
}
