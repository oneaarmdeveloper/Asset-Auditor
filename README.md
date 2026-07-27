# IT Asset Compliance Auditor

## Overview
A foundational, pure-Java command-line tool designed to audit  IT assets. It demonstrates core java fundamental: strict type safety, memory model awareness, and robust control flow.

## Architecture & Design Decisions
- **No Frameworks:** Built with pure Java to ensure deep understanding of the JVM pipeline.
- **Financial Precision:** Uses `BigDecimal` instead of `double` to prevent floating-point arithmetic errors in depreciation calculations.
- **Defensive Engineering:** Employs short-circuit evaluation (`&&`) to prevent `NullPointerException`s.
- **Modern Syntax:** Utilizes Java 14+ `switch` expressions for safe, exhaustive categorization.

## How to Run
1. Ensure JDK 21 is installed (`javac -version`).
2. Compile: `javac src/*.java`
3. Execute: `java -cp src Auditor`

## Mental Model Applied
Source (`*.java`) → Bytecode (`*.class` via `javac`) → JVM Execution (`java`).       
