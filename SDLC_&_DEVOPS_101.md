# Software Development Life Cycle (SDLC)

The SDLC is the cost-effective and time-efficient process used by development teams to design and build high-quality software. In modern DevOps environments, this cycle is **continuous**, not linear.

---

## 1. The Core Phases

| Phase           | Industry Reality                               | DevOps Objective                                       |
| --------------- | ---------------------------------------------- | ------------------------------------------------------ |
| **Requirement** | Defining the "What" and "Why."                 | Aligning business goals with technical feasibility.    |
| **Design**      | High-level (Architecture) & Low-level (Logic). | Designing for scalability and "deployability."         |
| **Development** | The actual coding and unit testing.            | Small, frequent commits to a shared repository.        |
| **Testing**     | QA, Integration, and UAT.                      | **Shift Left**: Automating tests as early as possible. |
| **Deployment**  | Releasing code to Production.                  | **CI/CD**: Making releases boring and repeatable.      |
| **Maintenance** | Monitoring, patching, and scaling.             | Feedback loops to inform the next Requirement phase.   |

### Waterfall (Legacy)

- **Structure:** Linear and sequential.
    
- **The Flaw:** You don't see the "working product" until the very end.
    
- **The Result:** High risk of project failure if requirements change mid-way.
    

### Agile (Modern)

- **Structure:** Iterative "Sprints" (usually 2 weeks).
    
- **The Flaw:** Can create a **Deployment Bottleneck** if the Operations team isn't as fast as the Development team.
    
- **The Result:** Rapid feature creation, but often high friction during release.
    

### DevOps (Industry Standard)

- **Structure:** A culture of shared responsibility.
    
- **The Fix:** Removes the "Wall of Confusion" between Dev and Ops through automation and communication.
    
- **The Result:** High velocity, high stability, and fast "Mean Time To Recovery" (MTTR).
