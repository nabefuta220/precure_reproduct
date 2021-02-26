#ifndef PRECURE
#define PRECURE 1
namespace Cure {
class Nabefuta {
private:
	int flag;

public:
	Nabefuta(int num);  //コンストラクタ
	int getFlag();      // flagの値を取得する
};
}  // namespace Cure
namespace Precure {
void action(void);               //引数なし版
void action(Cure::Nabefuta& a);  //引数がCure::Nabefutaのとき版
}  // namespace Precure
#endif
