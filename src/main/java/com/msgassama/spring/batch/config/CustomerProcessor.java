package com.msgassama.spring.batch.config;

import com.msgassama.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created lun. 21/08/2023 10:44
 *
 * @author MSGASSAMA
 * @project batch-processing-demo
 */
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
}
