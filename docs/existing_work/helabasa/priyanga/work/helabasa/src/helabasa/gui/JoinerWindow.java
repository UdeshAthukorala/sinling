 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . g u i ;  
  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
  
 i m p o r t   j a v a . a w t . B o r d e r L a y o u t ;  
 i m p o r t   j a v a . a w t . C o l o r ;  
 i m p o r t   j a v a . a w t . H e a d l e s s E x c e p t i o n ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e E v e n t ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s w i n g . B o r d e r F a c t o r y ;  
 i m p o r t   j a v a x . s w i n g . J B u t t o n ;  
 i m p o r t   j a v a x . s w i n g . J F r a m e ;  
 i m p o r t   j a v a x . s w i n g . J P a n e l ;  
 i m p o r t   j a v a x . s w i n g . J T e x t A r e a ;  
 i m p o r t   j a v a x . s w i n g . J T e x t F i e l d ;  
 i m p o r t   j a v a x . s w i n g . b o r d e r . B o r d e r ;  
 i m p o r t   j a v a x . s w i n g . e v e n t . M o u s e I n p u t A d a p t e r ;  
  
 p u b l i c   c l a s s   J o i n e r W i n d o w     e x t e n d s   J F r a m e   {  
  
 	 / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 2 6 0 8 6 3 3 3 9 1 7 6 3 8 7 2 6 2 L ;  
 	 / * *  
 	   *    
 	   * /  
  
 	 J T e x t F i e l d   t x t W 1   =   n e w   J T e x t F i e l d ( "������ " ) ;  
 	 J T e x t F i e l d   t x t W 2   =   n e w   J T e x t F i e l d ( "� " ) ;  
 	 J B u t t o n   b t n O k   =   n e w   J B u t t o n ( "   J o i n   " ) ;  
 	 J P a n e l   p n l C m d   =   n e w   J P a n e l ( ) ;  
 	  
 	 J T e x t A r e a   t x t O u t   =   n e w   J T e x t A r e a ( ) ;  
 	  
 	 / / H B W o r d J o i n e r 	 o W J   =   n e w   H B W o r d J o i n e r ( ) ;  
 	  
 	 p u b l i c   J o i n e r W i n d o w ( )   t h r o w s   H e a d l e s s E x c e p t i o n   {  
 	 	 t h i s . s e t T i t l e ( " H e l a b a s a   -   S i n h a l a   W o r d   J o i n e r " ) ;  
 	 	 t h i s . s e t S i z e ( 5 0 0 ,   3 0 0 ) ;  
 	 	  
 	 	 I n i t ( ) ;  
 	 	  
 	 	 t h i s . s e t D e f a u l t C l o s e O p e r a t i o n ( E X I T _ O N _ C L O S E ) ;  
 	 }  
  
 	  
 	 v o i d   I n i t ( )  
 	 {  
 	 	 t x t W 1 . s e t C o l u m n s ( 1 0 ) ;  
 	 	 t x t W 2 . s e t C o l u m n s ( 1 0 ) ; 	  
 	 	  
 	 	 p n l C m d . a d d ( t x t W 1 ) ;  
 	 	 p n l C m d . a d d ( t x t W 2 ) ;  
 	 	 p n l C m d . a d d ( b t n O k ) ;  
 	 	 	 	  
 	 	 / / j a v a . a w t . F o n t   f L a r g e   =   n e w   j a v a . a w t . F o n t ( " I s k o o l a   P o t a " ,   j a v a . a w t . F o n t . B O L D ,   1 8 ) ;  
 	 	 	 	 	  
 	 	 H B E v e n t H a n d l e r   o E H   =   n e w   H B E v e n t H a n d l e r ( ) ;  
 	 	 b t n O k . a d d M o u s e L i s t e n e r ( o E H ) ;  
 	 	 	 	  
 	 	 j a v a . a w t . F o n t   f   =   n e w   j a v a . a w t . F o n t ( " I s k o o l a   P o t a " ,   j a v a . a w t . F o n t . P L A I N ,   1 4 ) ;  
 	 	 t x t W 1 . s e t F o n t ( f ) ;  
 	 	 t x t W 2 . s e t F o n t ( f ) ;  
 	 	 t x t O u t . s e t F o n t ( f ) ;  
 	 	 	 	  
 	 	 B o r d e r L a y o u t   o B L   =   n e w   B o r d e r L a y o u t ( ) ;  
 	 	 t h i s . g e t C o n t e n t P a n e ( ) . s e t L a y o u t ( o B L ) ;  
 	 	 t h i s . g e t C o n t e n t P a n e ( ) . a d d ( p n l C m d ,   B o r d e r L a y o u t . N O R T H ) ;  
 	 	 t h i s . g e t C o n t e n t P a n e ( ) . a d d ( t x t O u t ,   B o r d e r L a y o u t . C E N T E R ) ;  
 	  
 	 	 B o r d e r   o B o r d e r   =   B o r d e r F a c t o r y . c r e a t e L i n e B o r d e r ( C o l o r . b l a c k ) ;  
 	 	 t x t O u t . s e t B o r d e r ( o B o r d e r ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   J o i n ( S t r i n g   s 1 ,   S t r i n g   s 2 )  
 	 {  
 	 	 L i s t < S t r i n g >   l s t O u t   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 S t r i n g   s T e x t   =   " " ;  
 	 	  
 	 	 f o r ( i n t   i = H B W o r d J o i n R u l e . P O O R W A _ S W A R A _ L O P A ;   i < H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D   +   1 ;   i + + )  
 	 	 {  
 	 	 	 l s t O u t . c l e a r ( ) ;  
 	 	 	 / / H B W o r d J o i n e r . J o i n ( s 1 ,   s 2 ,   i ,   l s t O u t ,   t r u e ,   1 ,   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ) ;  
 	 	 	  
 	 	 	 / / f o r ( i n t   j = 0 ;   j < l s t O u t . s i z e ( ) ;   j + + )  
 	 	 	 / / {  
 	 	 	 / / 	 s T e x t   =   s T e x t   +   " [ "   +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i ]   +   " ]   :   "   +   l s t O u t . g e t ( j )   +   " \ n " ;  
 	 	 	 / / } 	 	 	  
 	 	 }  
 	 	  
 	 	 t x t O u t . s e t T e x t ( s T e x t ) ;  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 J o i n e r W i n d o w   h W   =   n e w   J o i n e r W i n d o w ( ) ;  
 	 	 h W . s e t V i s i b l e ( t r u e ) ;  
  
 	 }  
  
 	  
 	 p u b l i c   c l a s s   H B E v e n t H a n d l e r   e x t e n d s   M o u s e I n p u t A d a p t e r  
 	 {  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   m o u s e C l i c k e d ( M o u s e E v e n t   e )   {  
 	 	 	 i f ( e . g e t C o m p o n e n t ( ) . e q u a l s ( b t n O k ) )  
 	 	 	 {  
 	 	 	 	 J o i n ( t x t W 1 . g e t T e x t ( ) . t r i m ( ) ,   t x t W 2 . g e t T e x t ( ) . t r i m ( ) ) ; 	 	 	 	 	 	 	 	  
 	 	 	 }  
  
 	 	  
 	 	 	 s u p e r . m o u s e C l i c k e d ( e ) ;  
 	 	 }  
 	 } 	  
 }  
