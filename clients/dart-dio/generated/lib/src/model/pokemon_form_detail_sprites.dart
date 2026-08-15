//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_detail_sprites.g.dart';

/// PokemonFormDetailSprites
///
/// Properties:
/// * [default_] 
@BuiltValue()
abstract class PokemonFormDetailSprites implements Built<PokemonFormDetailSprites, PokemonFormDetailSpritesBuilder> {
  @BuiltValueField(wireName: r'default')
  String? get default_;

  PokemonFormDetailSprites._();

  factory PokemonFormDetailSprites([void updates(PokemonFormDetailSpritesBuilder b)]) = _$PokemonFormDetailSprites;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormDetailSpritesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormDetailSprites> get serializer => _$PokemonFormDetailSpritesSerializer();
}

class _$PokemonFormDetailSpritesSerializer implements PrimitiveSerializer<PokemonFormDetailSprites> {
  @override
  final Iterable<Type> types = const [PokemonFormDetailSprites, _$PokemonFormDetailSprites];

  @override
  final String wireName = r'PokemonFormDetailSprites';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.default_ != null) {
      yield r'default';
      yield serializers.serialize(
        object.default_,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormDetailSpritesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.default_ = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormDetailSprites deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormDetailSpritesBuilder();
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

