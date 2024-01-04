package com.xworkz.exception.boot;

import com.xworkz.exception.blocks.*;

import java.io.IOException;

public class TryRunner {
    public static void main(String[] args) throws IOException {
        TryWithCatch tryWithCatch=new TryWithCatch();
        tryWithCatch.display();

        TryWithMultipleCatch tryWithMultipleCatch=new TryWithMultipleCatch();
        tryWithMultipleCatch.display();


        TryWithMultiCatch tryWithMultiCatch=new TryWithMultiCatch();
        tryWithMultiCatch.display();

        TryWithResources tryWithResources=new TryWithResources();
        tryWithResources.display();

        TryWithFinally tryWithFinally=new TryWithFinally();
        tryWithFinally.display();

        TryWithCatchAndFinally tryWithCatchAndFinally=new TryWithCatchAndFinally();
        tryWithCatchAndFinally.display();

        TryWithMultiCatchAndFinally tryWithMultiCatchAndFinally=new TryWithMultiCatchAndFinally();
        tryWithMultiCatchAndFinally.display();

        TryWithMultipleCatchAndFinally tryWithMultipleCatchAndFinally=new TryWithMultipleCatchAndFinally();
        tryWithMultipleCatchAndFinally.display();
        }



    }



