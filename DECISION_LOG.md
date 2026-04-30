# DECISION_LOG.md

## 1. Time Breakdown

* Project Setup:5 min
* API Implementation (Entity, Repository, Service, Controller): 30 - 40 min
* AI Feature Integration (OpenAI + fallback handling): 30 min
* Testing (Postman + debugging issues): 5 min
* Decision Log + README:30-40 min

Total Time: 2 hrs

---

## 2. Where AI Was Used — and Why
AI was used for:
* Generating task summaries using OpenAI API
* Debugging API integration issues (error handling, request structure)
* I dont know how to create enum in java and the status so i take help from AI to create enum and status for the task

Reason:
AI was used just to increase the  productivity and  speed up development especially for summarizing task descriptions.

---

## 3. Where AI Was NOT Used — and Why

AI was intentionally NOT used for:
* API design and endpoint structure
* Entity and database modeling
* Controller and service logic

Reason:
These components were implemented manually to maintain control over system design and ensure correctness, rather than blindly relying on generated code.

---

## 4. Bad AI Outputs (At Least 2)

### 1: Incorrect API Response Handling

AI initially suggested incorrect parsing of the OpenAI response, which caused null values.

Fix:
Manually inspected the response structure and corrected JSON parsing logic.

---

### 2: Wrong Exception Handling Approach

AI suggested handling HTTP errors directly inside the service layer using HTTP-specific classes.

Fix:
Refactored code to separate concerns:

* Service layer --> business logic
* Controller--> HTTP response handling

---

## 5. Trade-offs Made

* Used H2 in-memory database instead of MySQL to reduce setup time
* Avoided DTO layer to keep implementation simple and aligned with assignment constraints
* used the lombok library to reduce boilerplate code for getters/setters.
* during my placements training i was assigned a task to create one project within the 4 hr where i was fecing the open ai Api issue that my quota is over and i was not able to implement the ai features so i choose the easy summarization task to implement ai features in this project because of the token limit and the time constraint.

* Reason:
The assignment emphasizes speed, simplicity, and decision-making over over-engineering.

---

## 6. What Was NOT Built — and Why

* No authentication or authorization
* No frontend

Reason:
These were intentionally excluded to focus on core functionality within the given time constraint.

---

## 7. AI Feature Implementation Details

Feature Chosen: AI-generated task summaries

Implementation:

* Controller → Service → AIService → OpenAI API → Response → Save → Return
* The AI generates a short summary
* If the API fails (quota/connection issues), a fallback summarization logic is used


---

## 8. What I Would Improve With More Time

* Add DTO layer for better separation of concerns
* Add validation
* Add Authentication/Authorization
* Implement a frontend interface

---
