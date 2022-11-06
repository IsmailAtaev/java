package com.task.two;

import com.task.control.IControl;
import com.task.io.IData;
import com.task.io.IPrinter;
import com.task.service.IService;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class CircleModel implements IControl {
//    private  static  final  Logger logger = LogManager.getLogManager(Circle.class.getName());
    private Circle circleOne;
    private Circle circleTwo;
    private double result;


/*
    @Override
    public void workDo(IControl iControl) {

    }*/

    @Override
    public void init(IData iData) {
        this.circleOne.setRadius(iData.input("Enter radius a = "));
        this.circleTwo.setRadius(iData.input("Enter radius b = "));
    }

    @Override
    public void calc(IService iService) {
        this.result = CircleCalculate.getCircleAreaOfSmaller(this.circleOne, this.circleTwo);
    }

    @Override
    public void done(IPrinter iPrinter) {
        iPrinter.print("Result = ");
        iPrinter.print(this.result);
    }
}