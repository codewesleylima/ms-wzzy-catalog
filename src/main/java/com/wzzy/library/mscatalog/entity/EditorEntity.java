package com.wzzy.library.mscatalog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "editors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID editorIdEntity;

    private String nameEntity;
}
