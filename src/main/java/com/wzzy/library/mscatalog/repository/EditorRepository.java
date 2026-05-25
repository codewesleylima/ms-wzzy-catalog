package com.wzzy.library.mscatalog.repository;

import com.wzzy.library.mscatalog.entity.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditorRepository extends JpaRepository<Editor, String> {
    Optional<Editor> findByNameIgnoreCase(String name);
}
