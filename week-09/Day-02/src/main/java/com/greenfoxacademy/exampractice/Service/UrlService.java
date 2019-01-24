package com.greenfoxacademy.exampractice.Service;

import com.greenfoxacademy.exampractice.Model.Url;
import com.greenfoxacademy.exampractice.Repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrlService {

    UrlRepository urlRepository;

    @Autowired
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void newLink (Url url){
        urlRepository.save(url);
    }

    public boolean isIdUsed(String inputAlias) {
        return urlRepository.findById(inputAlias).isPresent();
    }

    public void increaseHitCount(String alias) {
        urlRepository.findByInputAlias(alias).increaseHitCount();
    }

    public Url findByInputAlias(String alias) {
        return urlRepository.findByInputAlias(alias);
    }

    public List<Url> listAllUrls() {
        return urlRepository.findAll();
    }

    public void deleteByInputAlias(String id) {
        urlRepository.deleteById(id);
    }
}
