package com.example.domain

import com.example
import com.google.protobuf.empty.Empty
import kalix.scalasdk.testkit.ValueEntityResult
import kalix.scalasdk.valueentity.ValueEntity
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UserSpec
    extends AnyWordSpec
    with Matchers {

  "User" must {

    "have example test that can be removed" in {
      val service = UserTestKit(new User(_))
      pending
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = service.someOperation(SomeRequest)
      // verify the reply
      // val reply = result.getReply()
      // reply shouldBe expectedReply
      // verify the final state after the command
      // service.currentState() shouldBe expectedState
    }

    "handle command Create" in {
      val service = UserTestKit(new User(_))
      pending
      // val result = service.create(example.CreateUser(...))
    }

  }
}
