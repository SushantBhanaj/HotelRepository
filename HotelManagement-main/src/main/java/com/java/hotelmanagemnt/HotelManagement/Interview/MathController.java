package com.java.hotelmanagemnt.HotelManagement.Interview;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MathController {

        public static void main(String[] args) {
            List<MathService> list=new ArrayList<MathService>();
            list.add(new MathService("mike",101,10,20000));
            list.add(new MathService("stallin",102,20,25000));
            list.add(new MathService("ram",103,10,30000));
            list.add(new MathService("mike",104,20,32000));

        }
    }

