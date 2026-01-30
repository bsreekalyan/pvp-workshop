### 1. The "Quality Gate" Status

This is the most important snippet. It’s the final "Yes/No" for your build.

> **Status:** `FAILED` 🔴
> 
> - **Reason:** Coverage on New Code < 80% (Current: 72.5%)
>     
> - **Reason:** Maintainability Rating is worse than A (Current: B)
>     

### 2. The "Big Five" Metrics (Overall Summary)

In the SonarQube UI, you will see a summary row that looks like this:

- **Bugs:** `12` (Rating: **C**) — _Potential logic errors._
    
- **Vulnerabilities:** `3` (Rating: **D**) — _Security weaknesses like SQL injection._
    
- **Code Smells:** `154` (Effort: **2d**) — _Cleanliness issues (e.g., dead code, long methods)._
    
- **Coverage:** `68.4%` — _How much of the code is actually tested._
    
- **Duplications:** `4.2%` — _Copied-and-pasted code that should be a single method._
    

---

### 3. "Clean as You Code" Report (New Code)

Professional teams focus on the **New Code** report. It ensures that even if the old code is messy, the _new_ code being added today is perfect.

- **New Bugs:** `0` ✅
    
- **New Vulnerabilities:** `0` ✅
    
- **Coverage on New Code:** `91%` ✅
    
- **Duplication on New Code:** `0.5%` ✅
    

### 4. Technical Debt Snippet

SonarQube calculates how long it would take a developer to fix all the "Code Smells."

> **Technical Debt:** `5h 30min`
> 
> - _Meaning:_ It would take one developer about 5.5 hours of focused work to clean up the sloppy parts of this Java project.


### How to read the "Ratings"

SonarQube uses a school-grade system:

- **A (Green):** Perfect. No issues found.
    
- **B (Yellow-Green):** Minor issues, easy to fix.
    
- **C (Yellow):** Moderate risk. You should fix this soon.
    
- **D (Orange):** High risk. Potential security or logic failure.
    
- **E (Red):** Critical failure. Fix immediately.
    