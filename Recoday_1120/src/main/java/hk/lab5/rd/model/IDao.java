package hk.lab5.rd.model;

import java.util.List;

import hk.lab5.rd.dtos.PageDto;

public interface IDao {

	public List<PageDto> selectPageList();
}
