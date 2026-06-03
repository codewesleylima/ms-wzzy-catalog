package com.wzzy.library.mscatalog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CatalogMapper {

    CatalogMapper INSTANCE = Mappers.getMapper(CatalogMapper.class);

    @Mapping(source = "catalogId", target = "catalogIdDTO")
    @Mapping(source = "catalogName", target = "catalogNameDTO")
    @Mapping(source = "descriptionId", target = "descriptionIdDTO")
    @Mapping(source = "cpf", target = "")
}
