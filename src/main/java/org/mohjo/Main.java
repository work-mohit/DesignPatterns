package org.mohjo;

import org.mohjo.command.AddCustomerCommand;
import org.mohjo.command.CustomerService;
import org.mohjo.command.composite.BlackAndWhiteCommand;
import org.mohjo.command.composite.CompositeCommand;
import org.mohjo.command.composite.ResizeCommand;
import org.mohjo.command.framework.Button;
import org.mohjo.iterator.BrowserHistory;
import org.mohjo.iterator.Iterator;
import org.mohjo.momento.Editor;
import org.mohjo.momento.History;
import org.mohjo.observer.Chart;
import org.mohjo.observer.DataSource;
import org.mohjo.observer.Sheet;
import org.mohjo.state.BrushTool;
import org.mohjo.state.Canvas;
import org.mohjo.state.SelectionTool;
import org.mohjo.strategy.*;
import org.mohjo.template.AuditTrail;
import org.mohjo.template.GenerateReport;
import org.mohjo.template.TransferMoneyTask;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        /* For Momento design pattern

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        */

        /* For State Design Pattern

        var canvas = new Canvas();
        canvas.setCurrentTools(new BrushTool());

        canvas.mouseDown();
        canvas.mouseUp();
        */

        /* For Iterator Design Pattern
           The problem part : The code below works totally fine, however if in the future we try to change the Data structure,
           which used to store the urls, that will affect the code outside our BrowserHistory class, for eg: if we use String[]
           instead of Arraylist then we can't use size() and add() So we have to design the structure
           in a way so that the only affecting class should be BrowserHistory class
           or a class which defines the rules not the class which uses those methods.


        var bh = new BrowserHistory();

        bh.push("a");
        bh.push("b");
        bh.push("c");
        bh.push("d");
        bh.pop();

        for(int i =0 ; i < bh.getUrls().size(); i++){
            System.out.println(bh.getUrls().get(i));
        }

        Solution code :


        var bh = new BrowserHistory();

        bh.push("a");
        bh.push("b");
        bh.push("c");
        bh.push("d");
        bh.pop();

        var itr = bh.createIterator();
        while(itr.hasNext()){
            var currUrl = itr.current();
            System.out.println(currUrl);
            itr.next();
        }

        */

        // For Strategy Pattern
        /*
        var imageStorage = new ImageStorage(
                new PngCompressor(),
                new HighContrastFilter()
        );
        imageStorage.store("flipkart");


        // Optimized one
        var imageStorage = new ImageStorage();
        imageStorage.store("flipkart", new JpegCompressor(), new BlackAndWhiteFilter());
        // calling same object to save image in the database with the different compression algorithm.
        imageStorage.store("flipkart", new PngCompressor(), new BlackAndWhiteFilter());

        // For Template Pattern
        var transferMoney = new TransferMoneyTask();
        transferMoney.execute();
        var generateReport = new GenerateReport();
        generateReport.execute();



        // For Command Pattern
        var addCustomerCommand = new AddCustomerCommand(new CustomerService());
        var button = new Button(addCustomerCommand);
        button.setLabel("hello");
        button.click();
        System.out.println(button.getLabel());



        // Composite Command

        var compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();
        compositeCommand.execute();
        compositeCommand.execute();

         */
        // For Observer Pattern

        var dataSource = new DataSource();
        dataSource.addObserver(new Sheet());
        dataSource.addObserver(new Chart());
        dataSource.addObserver(new Sheet());
        dataSource.setValue(1);





    }
}