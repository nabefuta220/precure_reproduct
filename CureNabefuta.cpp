#include <CureNabefuta.hpp>
#include <iostream>

Cure::Nabefuta::Nabefuta(int num) {
	this->flag = num;
	std::cout << "num :" << this->flag << std::endl;
}
int Cure::Nabefuta::getFlag() { return this->flag; }

void Precure::action(void) { std::cout << "NA" << std::endl; }
void Precure::action(Cure::Nabefuta& a) {
	std::cout << "action! (" << a.getFlag() << ")" << std::endl;
}














