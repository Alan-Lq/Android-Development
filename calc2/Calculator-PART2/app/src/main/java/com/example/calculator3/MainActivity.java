package com.example.calculator3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText inputNumber;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;
    private Button buttonPoint;

    private Button buttonPlus;
    private Button buttonEqual;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonSqr;
    private Button buttonSqrt;
    private Button buttonMinus;
    private Button buttonPercent;
    private Button buttonAC;
    private Button buttonClearOneChar;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonTg;
    private Button buttonCtg;
    private Button buttonSqrNM;
    private Button buttonLog;
    private Button buttonLn;
    private Button buttonFac;

    private double number1;
    private double number2;
    private double result;

    enum Sign {
        PLUS, MINUS, MUL, DIV, SQR, SQRT, PER, SIN, COS, TG, CTG, SQR1, LN, LOG, FAC
    }
    enum Minusor{
        da , net
    }
    private Sign sign;
    private Minusor minusor;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("temp", inputNumber.getText().toString());
        outState.putDouble("number1", number1);
        outState.putDouble("number2", number2);
        outState.putSerializable("sign", sign);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.text);

        buttonNumber1 = findViewById(R.id.bt_1);
        buttonNumber2 = findViewById(R.id.bt_2);
        buttonNumber3 = findViewById(R.id.bt_3);
        buttonNumber4 = findViewById(R.id.bt_4);
        buttonNumber5 = findViewById(R.id.bt_5);
        buttonNumber6 = findViewById(R.id.bt_6);
        buttonNumber7 = findViewById(R.id.bt_7);
        buttonNumber8 = findViewById(R.id.bt_8);
        buttonNumber9 = findViewById(R.id.bt_9);
        buttonNumber0 = findViewById(R.id.bt_0);

        buttonPlus = findViewById(R.id.bt_plus);
        buttonEqual = findViewById(R.id.bt_eq);
        buttonSqr = findViewById((R.id.bt_sqr));
        buttonDivide = findViewById(R.id.bt_div);
        buttonSqrt = findViewById(R.id.bt_sqrt);
        buttonMultiply = findViewById(R.id.bt_mult);
        buttonMinus = findViewById(R.id.bt_minus);
        buttonPercent = findViewById(R.id.percent);
        buttonClearOneChar = findViewById(R.id.bt_cancel);
        buttonAC = findViewById(R.id.bt_AC);
        buttonSin = findViewById(R.id.bt_sin);
        buttonCos = findViewById(R.id.bt_cos);
        buttonTg = findViewById(R.id.bt_tg);
        buttonCtg = findViewById(R.id.bt_ctg);
        buttonSqrNM = findViewById(R.id.bt_squareNM);
        buttonFac = findViewById(R.id.bt_fac);
        buttonLn = findViewById(R.id.bt_ln);
        buttonLog = findViewById(R.id.bt_log);
        buttonPoint = findViewById(R.id.bt_point);

        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);
        buttonNumber0.setOnClickListener(this);

        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonSqr.setOnClickListener(this);
        buttonClearOneChar.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        buttonSin.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTg.setOnClickListener(this);
        buttonCtg.setOnClickListener(this);
        buttonSqrNM.setOnClickListener(this);
        buttonLog.setOnClickListener(this);
        buttonLn.setOnClickListener(this);
        buttonFac.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);

        if (savedInstanceState != null) {
            super.onRestoreInstanceState(savedInstanceState);
            number1 = savedInstanceState.getDouble("number1");
            number2 = savedInstanceState.getDouble("number2");
            sign = (Sign) savedInstanceState.getSerializable("sign");
            inputNumber.setText(savedInstanceState.getString("temp"));
        }
    }



    private double calculateFactorial(double n){
        int num = 1;
        for (int i = 1; i <= n; i ++){
            num = num*i;
        }
        return num;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt_1:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("1");
                break;
            }
            case R.id.bt_2:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("2");
                break;
            }
            case R.id.bt_3:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("3");
                break;
            }
            case R.id.bt_4:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("4");
                break;
            }
            case R.id.bt_5:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("5");
                break;
            }
            case R.id.bt_6:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("6");
                break;
            }
            case R.id.bt_7:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("7");
                break;
            }
            case R.id.bt_8:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("8");
                break;
            }
            case R.id.bt_9:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.append("9");
                break;
            }
            case R.id.bt_0:{
               /* if(inputNumber.getText().toString().equals("-")){
                    inputNumber.setText("");
                    inputNumber.append("0");
                    break;
                }*/
                if(inputNumber.getText().toString().equals("NaN")  || inputNumber.getText().length()==1 && inputNumber.getText().toString().charAt(0) == '-' || inputNumber.getText().toString().equals("Infinity")){
                    inputNumber.setText("");
                }
                inputNumber.append("0");
                break;
            }
            case R.id.bt_plus:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }

                sign = Sign.PLUS;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_minus:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                if(sign==sign.MUL){
                    inputNumber.setText("-");
                    break;
                }
                if(sign==sign.DIV){
                    inputNumber.setText("-");
                    break;
                }
                sign = Sign.MINUS;

                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");
                    break;
                }
                else
                    inputNumber.setText("-");
                break;
            }
            case R.id.bt_div:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }

                sign = Sign.DIV;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_mult:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.MUL;
                if(inputNumber.getText().length() != 0){
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");
                    break;
                }
                else{
                    break;
                }
            }
            case R.id.bt_sqr:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.SQR;
                if(inputNumber.getText().length() != 0){
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_sqrt:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.SQRT;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.percent:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.PER;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_AC:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                inputNumber.setText("");
                break;
            }
            case R.id.bt_cancel:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                if (inputNumber.length() != 0) {
                    String number;
                    number = inputNumber.getText().toString();
                    number = number.substring(0, (number.length() - 1));
                    inputNumber.setText(number);
                    break;
                }
                else{
                    break;
                }
            }
            case R.id.bt_sin:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.SIN;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_cos:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.COS;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_tg:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.TG;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_ctg:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.CTG;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_squareNM:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.SQR1;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_fac:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.FAC;
                if(inputNumber.getText().length() != 0) {
                    number1 = Integer.parseInt(inputNumber.getText().toString());
                    if(number1<0){
                        minusor=Minusor.da;
                        number1*=(-1);
                    }
                    else {
                        minusor=Minusor.net;
                    }
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_ln:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }


                sign = Sign.LN;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_log:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                sign = Sign.LOG;
                if(inputNumber.getText().length() != 0) {
                    number1 = Float.parseFloat(inputNumber.getText().toString());
                    inputNumber.setText("");

                    break;
                }
                else
                    break;
            }
            case R.id.bt_point:{
                if(inputNumber.getText().toString().equals("NaN") || inputNumber.getText().toString().equals("Infinity") ){
                    inputNumber.setText("");
                }
                if (inputNumber.getText().length() == 0) {

                } else {
                    String number = inputNumber.getText().toString();
                    boolean point = number.contains(".");
                    if (!point)
                        inputNumber.setText(number + ".");
                }
                break;
            }
            case R.id.bt_eq: {
                if (sign == Sign.PLUS) {
                    number2 = Float.parseFloat(inputNumber.getText().toString());

                    result = number1 + number2;

                }
                else if(sign == Sign.MINUS){
                    number2 = Float.parseFloat(inputNumber.getText().toString());

                    result = number1 - number2;

                }
                else if(sign == Sign.MUL){
                    number2 = Float.parseFloat(inputNumber.getText().toString());
                    if(number2==(-0)){
                        number2=0;
                    }
                    if(number1==(-0)){
                        number1=0;
                    }
                    if(number1==0 || number2==0){
                        result=0;

                    }
                    else {

                        result = number1 * number2;
                    }
                }
                else if(sign == Sign.DIV){
                    number2 = Float.parseFloat(inputNumber.getText().toString());

                    result = number1 / number2;

                }
                else if(sign == Sign.SQR){

                    result = Math.pow(number1,2);
                }
                else if(sign == Sign.SQRT){

                    result = Math.sqrt(number1);
                }
                else if(sign == Sign.PER){

                    result = number1 / 100;
                }
                else if(sign == Sign.SIN){

                    result = Math.sin(number1);
                }
                else if(sign == Sign.COS){

                    result = Math.cos(number1);
                }
                else if(sign == Sign.TG){

                    result = Math.tan(number1);
                }
                else if(sign == Sign.CTG){

                    result = Math.cos(number1) / Math.sin(number1);
                }
                else if(sign == Sign.LN){

                    result = Math.log10(number1);
                }
                else if(sign == Sign.LOG){

                    result = Math.log(number1);
                }
                else if(sign == Sign.FAC){
                    long r=1;

                    for (int factor = 2; factor <= number1; factor++) {
                        r *= factor;
                    }
                    if(minusor==Minusor.da){
                        r*=(-1);
                    }
                    result=r;
                }
                else if(sign == Sign.SQR1){

                    number2 = Float.parseFloat(inputNumber.getText().toString());

                    result = Math.pow(number1, number2);
                }
                inputNumber.setText(String.valueOf(result));
                break;
            }
        }
    }
}
