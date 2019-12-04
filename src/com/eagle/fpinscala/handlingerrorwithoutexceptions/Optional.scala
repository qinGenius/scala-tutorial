package com.eagle.fpinscala.handlingerrorwithoutexceptions

trait Optional[+A] {
  def map[B](f: A => B) :Optional[B]

  def flatMap[B](f: A => B) :Optional[B]

  def filter(f: A=> Boolean):Optional[A]


}
