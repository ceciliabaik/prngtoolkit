����   7 3  tokenizer/SearchPattern  java/lang/Object pattern Ljava/util/regex/Pattern; matcher Ljava/util/regex/Matcher; grammar )Ltokenizer/lexicalGrammar/LexicalGrammar; <init> ()V Code
     LineNumberTable LocalVariableTable this Ltokenizer/SearchPattern; defineSearchPattern ()Ljava/util/regex/Pattern;  java/lang/Error  gUnresolved compilation problem: 
	The method getDescription() is undefined for the type LexicalGrammar

     (Ljava/lang/String;)V MatcherOfSearchPattern -(Ljava/lang/String;)Ljava/util/regex/Matcher;	     
 " $ # java/util/regex/Pattern  % 3(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher; inputStream Ljava/lang/String; hasSearchPatternMatch ()Z	  +  
 - / . java/util/regex/Matcher 0 ) matches 
SourceFile SearchPattern.java !                 	 
           /     *� �                               4     
� Y� �                   
            =     	*� +� !�                   	       	 & '   ( )     2     *� *� ,�                         1    2