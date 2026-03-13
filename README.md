1.
Fast-forward: Git przesuwa gałąź docelową do końca gałęzi funkcjonalnej jeśli nie ma żadnych nowych commitów w gałęzi docelowej od czasu utworzenia gałęzi funkcjonalnej. Historia pozostaje liniowa, merge commit nie powstaje.
Merge commit: Powstaje, gdy gałąź docelowa ma własne commity, których nie ma w gałęzi źródłowej. Git musi połączyć obie linie historii i tworzy nowy commit łączacy zmiany (które nie konfliktują ze sobą).

2.
Merge łączy dwie gałęzie zachowując rozgałęzioną historię i tworzy merge commit, jeśli gałąź docelowa ma własne commity. Rebase przepisuje commity jednej gałęzi na koniec drugiej, tworząc liniową historię bez merge commitów, ale zmienia historię.

3.
W moim repozytorium rozwiązałem konflikt na korzyść brancha main (kliknąłem w IntelliJ choose Left) i po kliknięciu tego przycisku została w moim working directory zostawiona wersja z nazwą zmiennej pętli jaka była scommitowana w branchu main, wpisałem po rozstrzygnięciu konfliktu git commit w PowerShellu i stworzył się ostatni commit: Merge branch 'feature-conflict' (a64e4a9) 
