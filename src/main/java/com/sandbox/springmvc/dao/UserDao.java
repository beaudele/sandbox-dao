package com.sandbox.springmvc.dao;

import com.sandbox.springmvc.model.RegisteredUser;

import java.util.List;

/**
 * The Interface UserDao.
 */
public interface UserDao {

  /**
   * Find by id.
   *
   * @param id the id
   * @return the registered user
   */
  RegisteredUser findById(Long id);

  /**
   * Find by name.
   *
   * @param name the name
   * @return the registered user
   */
  RegisteredUser findByName(String name);

  /**
   * Save user.
   *
   * @param user the user
   */
  void saveUser(RegisteredUser user);

  /**
   * Update user.
   *
   * @param user the user
   */
  void updateUser(RegisteredUser user);

  /**
   * Delete user by id.
   *
   * @param id the id
   */
  void deleteUserById(Long id);

  /**
   * Find all users.
   *
   * @return the list
   */
  List<RegisteredUser> findAllUsers();

  /**
   * Delete all users.
   */
  void deleteAllUsers();

  /**
   * Checks if is user exist.
   *
   * @param user the user
   * @return true, if is user exist
   */
  public boolean isUserExist(RegisteredUser user);

}
