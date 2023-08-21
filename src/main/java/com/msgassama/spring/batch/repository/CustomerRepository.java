package com.msgassama.spring.batch.repository;

import com.msgassama.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created lun. 21/08/2023 09:59
 *
 * @author MSGASSAMA
 * @project batch-processing-demo
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
