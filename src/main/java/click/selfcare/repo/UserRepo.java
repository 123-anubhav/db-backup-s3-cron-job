package click.selfcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import click.selfcare.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
