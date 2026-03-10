TP 3 : Spring IoC & POC

Dans ce TP, nous avons appliqué le principe Open Closed Principle (OCP) qui consiste à rendre le système ouvert à l’extension mais fermé à la modification. L’application a été conçue de manière à permettre le changement de l’implémentation de l’interface IDao sans modifier la classe métier MetierImpl. Pour cela, nous avons utilisé le mécanisme des profils Spring (dev, prod) afin de sélectionner dynamiquement l’implémentation appropriée au moment de l’exécution. Cette approche permet de maintenir un code flexible, évolutif et conforme aux bonnes pratiques de l’injection de dépendances avec Spring.


DaoApi
<img width="1600" height="643" alt="Capture d&#39;écran 2026-03-10 043227" src="https://github.com/user-attachments/assets/51f03873-c6c7-450f-b094-54187f1c09da" />
DaoImpl
<img width="1745" height="591" alt="Capture d&#39;écran 2026-03-10 042956" src="https://github.com/user-attachments/assets/64fd0dde-4de5-4bf2-975d-5b3561d4c72a" />
DaoImpl2
<img width="1614" height="547" alt="Capture d&#39;écran 2026-03-10 043033" src="https://github.com/user-attachments/assets/9108393b-5a34-47cb-b770-4e980fef7532" />
DaoFile
<img width="1202" height="566" alt="Capture d&#39;écran 2026-03-10 043158" src="https://github.com/user-attachments/assets/88a8a69e-9a80-4d6c-8204-12acfcd7a3c7" />

Tests de non-régression (JUnit 4)

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 045350" src="https://github.com/user-attachments/assets/c47991cc-6ec5-4ad1-b899-8d1bda7df8d5" />
