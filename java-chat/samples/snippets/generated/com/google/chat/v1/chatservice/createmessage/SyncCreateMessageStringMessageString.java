/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.chat.v1.samples;

// [START chat_v1_generated_ChatService_CreateMessage_StringMessageString_sync]
import com.google.chat.v1.ChatServiceClient;
import com.google.chat.v1.Message;
import com.google.chat.v1.SpaceName;

public class SyncCreateMessageStringMessageString {

  public static void main(String[] args) throws Exception {
    syncCreateMessageStringMessageString();
  }

  public static void syncCreateMessageStringMessageString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ChatServiceClient chatServiceClient = ChatServiceClient.create()) {
      String parent = SpaceName.of("[SPACE]").toString();
      Message message = Message.newBuilder().build();
      String messageId = "messageId-1440013438";
      Message response = chatServiceClient.createMessage(parent, message, messageId);
    }
  }
}
// [END chat_v1_generated_ChatService_CreateMessage_StringMessageString_sync]
