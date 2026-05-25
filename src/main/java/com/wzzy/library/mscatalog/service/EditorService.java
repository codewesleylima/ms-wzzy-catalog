package com.wzzy.library.mscatalog.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.EditorDTO;

public interface EditorService {
    EditorDTO createEditor(EditorDTO editorDTO);
    EditorDTO getEditorById(String id);
    PaginationDTO<EditorDTO> getAllEditors(int page, int size);
    EditorDTO updateEditor(String id, EditorDTO editorDTO);
    void deleteEditor(String id);
}
