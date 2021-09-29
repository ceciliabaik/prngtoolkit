����   7 :  (tokenizer/finiteStateMachine/AcceptState  java/lang/Object  "tokenizer/finiteStateMachine/State context &Ltokenizer/finiteStateMachine/Context; inputStream Ljava/lang/String; <init> (Ljava/lang/String;)V Code
     ()V	   	 
 LineNumberTable LocalVariableTable this *Ltokenizer/finiteStateMachine/AcceptState; performTransition
    java/lang/String   length ()I i I StackMapTable foundCharacterMatch
  # $ % charAt (I)C
 ' ) ( java/lang/Character * + valueOf (C)Ljava/lang/Character;
 ' - . / equals (Ljava/lang/Object;)Z char1 Ljava/lang/Character; charEnd createLexeme ()Ltokenizer/Lexeme; 6 tokenizer/Lexeme
 5  
SourceFile AcceptState.java !            	 
           F     
*� *+� �           	  
 	         
       
 	 
         Y     <� �*� � ����       
                             �   !      q     '*� � "� &L*� *� � d� "� &M+,� ,W�                 &          '       0 1     2 1   3 4     2     � 5Y� 7�                         8    9