 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B A n a l y z e r ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n s ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   W o r d A n a l y z e r   e x t e n d s   H t t p S e r v l e t   {  
  
 	 / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   - 1 6 4 1 8 9 9 8 9 2 0 1 0 6 3 5 5 L ;  
  
 	 p u b l i c   W o r d A n a l y z e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
         	 S t r i n g   s W o r d   =   o R e q . g e t P a r a m e t e r ( " t w o r d " ) ;  
                 i f ( s W o r d = = n u l l )  
                 {  
                 	 s W o r d   =   " " ;  
                 }         	  
         	 p r i n t P a g e ( o R e s ,   s W o r d ) ;  
         }  
          
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e s p o n s e   o R e s ,   S t r i n g   s W o r d )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   S a n d h i < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / i n d e x . h t m l ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > W o r d   A n a l y z e r   (���  ������ )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f s a n d h i '   a c t i o n = . / w o r d _ a n a l y z e r   a l i g n = ' c e n t e r ' > " ) ;  
                  
          
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' t e x t '   n a m e = ' t w o r d '   v a l u e = ' "   +   s W o r d   +   " '   s t y l e = ' f o n t - s i z e :   2 0 ' > " ) ;  
  
                 o u t . p r i n t l n ( " < b r > < b r > < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' A n a l y z e '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   6 e m ' > " ) ;  
                 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                  
                 i f ( s W o r d = = n u l l   | |   s W o r d . l e n g t h ( ) = = 0 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > I n p u t   t h e   a   S i n h a l a   w o r d s   t o   a n a l y z e ! < / p > " ) ;  
                 }  
                 e l s e  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
                 	 A n a l y z e W o r d ( s W o r d ) ;  
                 	 o u t . p r i n t l n ( " < / p > " ) ;  
                 }                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                  
        
         } 	  
          
 	 p u b l i c   s t a t i c   v o i d   A n a l y z e W o r d ( S t r i n g   s W o r d )  
 	 {  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " < b >   T O D O   :   G e t   a l l   t h e   p o s s i b l e   L e m m a   l i s t s   a n d   T r y   t o   C o n j u g a t e   t h e m   a s   N o n e   o r   V e r b   -   G e t   t h e   s c o r e   < / b > < b r > \ r " ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = < b r > \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " A n a l y z i n g   :   "   +   s W o r d   +   " < b r > \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = < b r > \ r " ) ;  
 	 	 H B A n a l y z e r   o A n a l y z e r   =   n e w   H B A n a l y z e r ( ) ;  
 	 	 L i s t < H B P O S >   l s t R e s u l t s   =   n e w   A r r a y L i s t < H B P O S > ( ) ;  
 	 	 o A n a l y z e r . A n a l y z e ( s W o r d ,   l s t R e s u l t s ) ;  
 	 	  
 	 	 H B W o r d   o W o r d   =   n e w   H B W o r d ( s W o r d ) ;  
 	 	 / / S o r t i n g   R e s u l t s    
 	 	 C o l l e c t i o n s . s o r t ( l s t R e s u l t s ,   n e w   H B P O S . H B P O S S c o r e C o m p a r a t o r ( ) ) ;  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < l s t R e s u l t s . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H B P O S   o P o s   =   l s t R e s u l t s . g e t ( i ) ;  
 	 	 	 i f ( o P o s . G e t S c o r e ( ) > 0   & &     o P o s . F i n d F o r m ( o W o r d ) )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - < b r > \ r " ) ;  
 	 	 	 	 o P o s . D e b u g P r i n t ( ) ;  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - < b r > \ r " ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 } 	 	          
 }  
