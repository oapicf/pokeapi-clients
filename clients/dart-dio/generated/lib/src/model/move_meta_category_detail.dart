//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_meta_category_description.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta_category_detail.g.dart';

/// MoveMetaCategoryDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [descriptions] 
/// * [moves] 
@BuiltValue()
abstract class MoveMetaCategoryDetail implements Built<MoveMetaCategoryDetail, MoveMetaCategoryDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<MoveMetaCategoryDescription> get descriptions;

  @BuiltValueField(wireName: r'moves')
  BuiltList<AbilityDetailPokemonInnerPokemon> get moves;

  MoveMetaCategoryDetail._();

  factory MoveMetaCategoryDetail([void updates(MoveMetaCategoryDetailBuilder b)]) = _$MoveMetaCategoryDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaCategoryDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMetaCategoryDetail> get serializer => _$MoveMetaCategoryDetailSerializer();
}

class _$MoveMetaCategoryDetailSerializer implements PrimitiveSerializer<MoveMetaCategoryDetail> {
  @override
  final Iterable<Type> types = const [MoveMetaCategoryDetail, _$MoveMetaCategoryDetail];

  @override
  final String wireName = r'MoveMetaCategoryDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMetaCategoryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(MoveMetaCategoryDescription)]),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveMetaCategoryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaCategoryDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveMetaCategoryDescription)]),
          ) as BuiltList<MoveMetaCategoryDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.moves.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveMetaCategoryDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaCategoryDetailBuilder();
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

