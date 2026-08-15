//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_detail_affecting_moves_increase_inner.g.dart';

/// StatDetailAffectingMovesIncreaseInner
///
/// Properties:
/// * [change] 
/// * [move] 
@BuiltValue()
abstract class StatDetailAffectingMovesIncreaseInner implements Built<StatDetailAffectingMovesIncreaseInner, StatDetailAffectingMovesIncreaseInnerBuilder> {
  @BuiltValueField(wireName: r'change')
  int get change;

  @BuiltValueField(wireName: r'move')
  AbilityDetailPokemonInnerPokemon get move;

  StatDetailAffectingMovesIncreaseInner._();

  factory StatDetailAffectingMovesIncreaseInner([void updates(StatDetailAffectingMovesIncreaseInnerBuilder b)]) = _$StatDetailAffectingMovesIncreaseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatDetailAffectingMovesIncreaseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatDetailAffectingMovesIncreaseInner> get serializer => _$StatDetailAffectingMovesIncreaseInnerSerializer();
}

class _$StatDetailAffectingMovesIncreaseInnerSerializer implements PrimitiveSerializer<StatDetailAffectingMovesIncreaseInner> {
  @override
  final Iterable<Type> types = const [StatDetailAffectingMovesIncreaseInner, _$StatDetailAffectingMovesIncreaseInner];

  @override
  final String wireName = r'StatDetailAffectingMovesIncreaseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatDetailAffectingMovesIncreaseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'change';
    yield serializers.serialize(
      object.change,
      specifiedType: const FullType(int),
    );
    yield r'move';
    yield serializers.serialize(
      object.move,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatDetailAffectingMovesIncreaseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatDetailAffectingMovesIncreaseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.change = valueDes;
          break;
        case r'move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.move.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StatDetailAffectingMovesIncreaseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatDetailAffectingMovesIncreaseInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

