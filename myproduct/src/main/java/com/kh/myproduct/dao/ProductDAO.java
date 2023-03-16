package com.kh.myproduct.dao;

import java.util.List;

public interface ProductDAO {
  // 등록
  Long save(Product product);
  // 조회
  Product findById(Long productId);
  // 수정
  int update(Long productId, Product product);
  // 삭제
  int delete(Long productId);
  // 목록
  List<Product> findAll();
}
