//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_sprites.g.dart';

/// PokemonDetailSprites
///
/// Properties:
/// * [frontDefault] 
@BuiltValue()
abstract class PokemonDetailSprites implements Built<PokemonDetailSprites, PokemonDetailSpritesBuilder> {
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  PokemonDetailSprites._();

  factory PokemonDetailSprites([void updates(PokemonDetailSpritesBuilder b)]) = _$PokemonDetailSprites;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailSpritesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailSprites> get serializer => _$PokemonDetailSpritesSerializer();
}

class _$PokemonDetailSpritesSerializer implements PrimitiveSerializer<PokemonDetailSprites> {
  @override
  final Iterable<Type> types = const [PokemonDetailSprites, _$PokemonDetailSprites];

  @override
  final String wireName = r'PokemonDetailSprites';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.frontDefault != null) {
      yield r'front_default';
      yield serializers.serialize(
        object.frontDefault,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailSpritesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'front_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontDefault = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailSprites deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailSpritesBuilder();
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

