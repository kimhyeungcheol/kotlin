// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrErrorCallExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrErrorCallExpression)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required int32 description = 1;</code>
   */
  boolean hasDescription();
  /**
   * <code>required int32 description = 1;</code>
   */
  int getDescription();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression receiver = 2;</code>
   */
  boolean hasReceiver();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression receiver = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getReceiver();

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value_argument = 3;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression> 
      getValueArgumentList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value_argument = 3;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getValueArgument(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value_argument = 3;</code>
   */
  int getValueArgumentCount();
}