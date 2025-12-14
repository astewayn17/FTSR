<p align="left">
  <img src="docs/Flat-Final-Logo.png" alt="alt text" width="700">
</p>

FTSR is a full-stack learning project that simulates an internal banking system used for secure file uploads, status tracking, and audit record management. The goal is to gain hands-on experience across backend development, frontend development, CI/CD pipelines, and enterprise tooling.

---

## 🚀 Overview

Users can upload files, view historical transfer records, and track processing status.  
The project is built as a **monorepo** and serves as a practical environment to explore:

- Java + Spring Boot API development  
- Angular frontend development  
- SQL database integration  
- Docker containerization  
- Jenkins CI/CD pipelines (build → test → analyze → containerize → scan → deploy)  
- Structured JSON logging for Splunk-style observability  

---

## 🧱 Repo Structure
```
FTSR/
├── backend/ Spring Boot API (Java)
├── frontend/ Angular web application
├── infra/ Jenkins, Docker, CI/CD configuration
├── docs/ Architecture notes, diagrams, documentation
└── README.md Project overview and instructions
```
---

## ⚙️ Tech Stack

**Backend:** Java 17+, Spring Boot, JPA, PostgreSQL  
**Frontend:** Angular, TypeScript  
**DevOps:** Docker, Jenkins, SonarQube, Trivy/Aqua Scan, GitHub Projects  

---

## 🎯 Core Features

- File upload endpoint  
- Transfer record storage and retrieval  
- JSON logging with correlation IDs  
- Angular UI for uploads & history  
- End-to-end CI/CD pipeline (in progress)

---

## 🗺️ Roadmap (High Level)

1. Backend foundation (entities, REST API, file upload)  
2. Angular UI setup and API integration  
3. JSON logging & audit improvements  
4. Docker containerization  
5. Jenkins CI/CD pipeline  
6. Optional enhancements (async processing, auth, search)

---

## 📚 Purpose

FTSR is not a production system.  
It is a **professional development project** designed to build confidence and practical experience for transitioning into a software developer role—especially in large, regulated organizations.

---
