// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.ddpanda.proto;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ddpanda_proto_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ddpanda_proto_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ddpanda_proto_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ddpanda_proto_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\021com.ddpanda.proto\"" +
      "3\n\014HelloRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010la" +
      "stName\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010greetin" +
      "g\030\001 \001(\t2Z\n\014HelloService\022J\n\005hello\022\037.com.d" +
      "dpanda.proto.HelloRequest\032 .com.ddpanda." +
      "proto.HelloResponseB\005P\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_ddpanda_proto_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ddpanda_proto_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ddpanda_proto_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_ddpanda_proto_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ddpanda_proto_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ddpanda_proto_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
