/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.notebooks.v1beta1.samples;

// [START notebooks_v1beta1_generated_NotebookService_ListEnvironments_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.notebooks.v1beta1.Environment;
import com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest;
import com.google.cloud.notebooks.v1beta1.NotebookServiceClient;

public class AsyncListEnvironments {

  public static void main(String[] args) throws Exception {
    asyncListEnvironments();
  }

  public static void asyncListEnvironments() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      ListEnvironmentsRequest request =
          ListEnvironmentsRequest.newBuilder()
              .setParent("parent-995424086")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Environment> future =
          notebookServiceClient.listEnvironmentsPagedCallable().futureCall(request);
      // Do something.
      for (Environment element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END notebooks_v1beta1_generated_NotebookService_ListEnvironments_async]
