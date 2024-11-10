package org.mohjo.command;

import org.mohjo.command.framework.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;
    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }
    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
