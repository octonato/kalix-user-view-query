package com.example.domain

import com.example
import com.google.protobuf.empty.Empty
import kalix.scalasdk.valueentity.ValueEntity
import kalix.scalasdk.valueentity.ValueEntityContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class User(context: ValueEntityContext) extends AbstractUser {
  override def emptyState: UserState = UserState()

  override def create(currentState: UserState, createUser: example.CreateUser): ValueEntity.Effect[Empty] =
    effects
      .updateState(UserState(firstName = createUser.firstName, lastName = createUser.lastName))
      .thenReply(Empty.defaultInstance)

}

