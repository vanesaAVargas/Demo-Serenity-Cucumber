# Swag Labs Automation with Serenity BDD + Cucumber

## Table of Contents
- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Test Structure](#test-structure)
- [Reporting](#reporting)
- [Troubleshooting](#troubleshooting)

## Project Overview
Automation framework for testing [Swag Labs](https://www.saucedemo.com/) demo e-commerce site using:
- Behavior-Driven Development (BDD) approach
- Page Object Model pattern
- Serenity's enhanced reporting capabilities

## Technology Stack
| Component       | Version |
|----------------|---------|
| Serenity BDD   | 4.2.22  |
| Cucumber       | 7.17.0  |
| JUnit          | 4.13.2  |
| Java           | 23      |
| Maven          | 3.9+    |

## Setup Instructions

### Prerequisites
1. Install JDK 23
2. Install Maven 3.9+
3. Install Git

### Installation
```bash
git clone <repository-url>
cd SwageDemo
mvn clean install
```

Running Tests
Run all tests

mvn clean verify

Run with specific browser
mvn clean verify -Dwebdriver.driver=firefox

Run specific feature
mvn clean verify -Dcucumber.filter.tags="@login"

Test Structure
src/
├── main/
│   ├── java/
│   │   ├── pages/          # Page objects
│   │   ├── steps/          # Step definitions
│   │   └── utils/          # Helper classes
│   └── resources/
│       ├── serenity.conf   # Config file
│       └── webdriver/      # Driver binaries
└── test/
    ├── java/
    │   └── runners/        # Test runners
    └── resources/
        └── features/       # Gherkin feature files
Reporting
Serenity generates rich interactive reports located at:
target/site/serenity/index.html

Sample report includes:

-Test results dashboard
-Step-by-step screenshots
-Timing metrics
-Requirement coverage

Troubleshooting

Common Issues
Browser compatibility:
Ensure Chrome/Firefox matches driver version
Download drivers to webdriver directory

Test failures:
Check application state
Review screenshots in report

Dependency conflicts:
Run mvn dependency:tree to identify conflicts

Getting Help
For support, please open an issue in the project repository.
