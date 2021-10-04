����   7 �  tokenizer/Tokenizer  java/lang/Object tokenTypeList Ljava/util/ArrayList; 	Signature HLjava/util/ArrayList<Ltokenizer/lexicalGrammar/EnumMapRegex$TokenType;>; inputStream Ljava/lang/String; isActiveToken Z tokens )Ljava/util/ArrayList<Ljava/lang/String;>; <init> *(Ljava/util/ArrayList;Ljava/lang/String;)V ](Ljava/util/ArrayList<Ltokenizer/lexicalGrammar/EnumMapRegex$TokenType;>;Ljava/lang/String;)V Code
     ()V  java/util/ArrayList  java/lang/String  Meningen  består  av ! ord # .
 % ' & java/util/Arrays ( ) asList %([Ljava/lang/Object;)Ljava/util/List;
  +  , (Ljava/util/Collection;)V	  .  	  0  	  2 	 
 LineNumberTable LocalVariableTable this Ltokenizer/Tokenizer; LocalVariableTypeTable getInputStream ()Ljava/lang/String; ()Z	  <   setActiveToken (Z)V activeToken performTokenization
  B C  categorizeIntoTokens performEvaluation
  F G H delimitInputStream ()[Ljava/lang/String;
  J K L length ()I i I StackMapTable Q  
  S T U split '(Ljava/lang/String;)[Ljava/lang/String; removeWhiteSpace
  X Y 9 trim removeComment \ java/lang/Error ^ TUnresolved compilation problem: 
	This method must return a result of type String[]

 [ `  a (Ljava/lang/String;)V getInitialActiveToken
  d  :
  f = >	 h j i java/lang/System k l out Ljava/io/PrintStream;
  n o p get (I)Ljava/lang/Object;
 r t s java/io/PrintStream u a println moveActiveTokenForward
  x y L size moveActiveTokenBackwards getEndToken hasMoreTokens (Ljava/util/ArrayList;)Z ,(Ljava/util/ArrayList<Ljava/lang/String;>;)Z
  � � : isEmpty 
SourceFile Tokenizer.java InnerClasses � /tokenizer/lexicalGrammar/EnumMapRegex$TokenType � %tokenizer/lexicalGrammar/EnumMapRegex 	TokenType !                	 
                               �     :*� *� Y� YSYSYSY SY"S� $� *� -*+� /*,� 1�    3          /  4  9  4        : 5 6     :      : 	 
  7       :     8 9     /     *� 1�    3        4        5 6     :     /     *� ;�    3        4        5 6    = >     >     *� ;�    3   
    #  $ 4        5 6      ?    @      3     *� A�    3   
    '  ( 4        5 6    D      f     <� *� EW�*� 1� I���    3       +  , 
 +  - 4        5 6     M N  O    �   G H     4     
*� 1P� R�    3       0 4       
 5 6    V 9     2     *� 1� W�    3       4 4        5 6    Z H     4     
� [Y]� _�    3       7 4       
 5 6    C      +      �    3       > 4        5 6    b      ]     *� c� *� e� g*� -� m� � q�    3       A  B  C  D 4        5 6   O      v      r     %<� � g*� -� m� � q�*� -� w���    3       G  H  G $ I 4       % 5 6    " M N  O    �   z      s     &*� -� wd<� � g*� -� m� � q�����    3       L  M  L % N 4       & 5 6   
  M N  O    �   {      y     ,*� -� w<� � g*� -*� -� wd� m� � q�����    3       Q  R $ Q + S 4       , 5 6    # M N  O    �   | }      ~    K     +� �    3       V 4        5 6         7            �    � �   
  � � �@